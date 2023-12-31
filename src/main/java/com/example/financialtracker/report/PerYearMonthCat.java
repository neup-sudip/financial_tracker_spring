package com.example.financialtracker.report;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PerYearMonthCat {
    private int year;
    private int month;
    private String category;
    private BigDecimal total;

    public PerYearMonthCat(Map<String, Object> report ) {
        this.year = (int) report.get("year");
        this.month = (int) report.get("month");
        this.category = String.valueOf(report.get("category"));
        this.total = (BigDecimal) report.get("total");
    }
}
