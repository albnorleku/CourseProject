package com.roiacademy.h2Database.model;

import java.sql.ResultSet;

public interface BaseModel<T> {
    T mapToObject(ResultSet rs);
}
