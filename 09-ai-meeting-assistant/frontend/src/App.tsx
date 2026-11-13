import {useState} from 'react';
const API=import.meta.env.VITE_API_BASE_URL??'http://localhost:8080';
export default function App(){
 const [value,setValue]=useState('Paste meeting notes here...');
 const [result,setResult]=useState('');
 const [busy,setBusy]=useState(false);
 async function submit(){
  if(!value.trim()||busy)return;
  setBusy(true);setResult('');
  try{
   const response=await fetch(`${API}/api/v1/meetings/summarize`,{method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify({meetingText:value})});
   if(!response.ok)throw new Error(`API returned ${response.status}`);
   const data=await response.json();
   setResult(data.result??data.answer??data.summary??JSON.stringify(data,null,2));
  }catch{setResult('Backend unavailable. Start the Spring Boot service and check VITE_API_BASE_URL.')}finally{setBusy(false)}
 }
 return <main className="shell">
  <div className="header"><div><h1>AI Meeting Assistant</h1><p className="muted">Upload or paste meeting notes and produce a structured summary, decisions and action items.</p></div><span>09</span></div>
  <section className="panel">
   <label>Meeting text<textarea className="field" rows={7} value={value} onChange={e=>setValue(e.target.value)} placeholder=Meeting transcript or notes are required./></label>
   <button className="primary" disabled={busy||!value.trim()} onClick={()=>void submit()}>{busy?'Processing...':'Submit'}</button>
   <div className="result">{result||'Result appears here.'}</div>
  </section>
 </main>;
}
