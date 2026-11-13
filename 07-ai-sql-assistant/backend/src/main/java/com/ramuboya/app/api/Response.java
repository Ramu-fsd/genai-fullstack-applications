package com.ramuboya.app.api;
import java.util.List;
public record SqlDraftResponse(String sql,String explanation,boolean executable) {}
