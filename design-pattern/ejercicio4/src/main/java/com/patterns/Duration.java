package com.patterns;

import java.time.LocalDate;

public class Duration {
    private LocalDate startDate;
    private LocalDate endDate;

    public Duration() {
        this.startDate = LocalDate.now();
        LocalDate endDate = null;
    }

    public void setEndDate() {
        this.endDate = LocalDate.now();
    }
}
