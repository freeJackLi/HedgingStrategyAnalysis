package com.freelxl.coin.hsa.bean;

import java.util.Calendar;
import java.util.Date;

public class DepthData {

    Calendar startCalendar;
    Calendar endCalendar;

    double ask1Price;
    double ask1Size;

    double ask2Price;
    double ask2Size;

    double ask3Price;
    double ask3Size;

    double ask4Price;
    double ask4Size;

    double ask5Price;
    double ask5Size;


    double bid1Price;
    double bid1Size;

    double bid2Price;
    double bid2Size;

    double bid3Price;
    double bid3Size;

    double bid4Price;
    double bid4Size;

    double bid5Price;
    double bid5Size;

    @Override
    public String toString() {
        return "DepthData{" +
                "startCalendar=" + startCalendar +
                ", endCalendar=" + endCalendar +
                ", ask1Price=" + ask1Price +
                ", ask1Size=" + ask1Size +
                ", ask2Price=" + ask2Price +
                ", ask2Size=" + ask2Size +
                ", ask3Price=" + ask3Price +
                ", ask3Size=" + ask3Size +
                ", ask4Price=" + ask4Price +
                ", ask4Size=" + ask4Size +
                ", ask5Price=" + ask5Price +
                ", ask5Size=" + ask5Size +
                ", bid1Price=" + bid1Price +
                ", bid1Size=" + bid1Size +
                ", bid2Price=" + bid2Price +
                ", bid2Size=" + bid2Size +
                ", bid3Price=" + bid3Price +
                ", bid3Size=" + bid3Size +
                ", bid4Price=" + bid4Price +
                ", bid4Size=" + bid4Size +
                ", bid5Price=" + bid5Price +
                ", bid5Size=" + bid5Size +
                '}';
    }

    public Calendar getStartCalendar() {
        return startCalendar;
    }

    public void setStartCalendar(Calendar startCalendar) {
        this.startCalendar = startCalendar;
    }

    public Calendar getEndCalendar() {
        return endCalendar;
    }

    public void setEndCalendar(Calendar endCalendar) {
        this.endCalendar = endCalendar;
    }

    public double getAsk1Price() {
        return ask1Price;
    }

    public void setAsk1Price(double ask1Price) {
        this.ask1Price = ask1Price;
    }

    public double getAsk1Size() {
        return ask1Size;
    }

    public void setAsk1Size(double ask1Size) {
        this.ask1Size = ask1Size;
    }

    public double getAsk2Price() {
        return ask2Price;
    }

    public void setAsk2Price(double ask2Price) {
        this.ask2Price = ask2Price;
    }

    public double getAsk2Size() {
        return ask2Size;
    }

    public void setAsk2Size(double ask2Size) {
        this.ask2Size = ask2Size;
    }

    public double getAsk3Price() {
        return ask3Price;
    }

    public void setAsk3Price(double ask3Price) {
        this.ask3Price = ask3Price;
    }

    public double getAsk3Size() {
        return ask3Size;
    }

    public void setAsk3Size(double ask3Size) {
        this.ask3Size = ask3Size;
    }

    public double getAsk4Price() {
        return ask4Price;
    }

    public void setAsk4Price(double ask4Price) {
        this.ask4Price = ask4Price;
    }

    public double getAsk4Size() {
        return ask4Size;
    }

    public void setAsk4Size(double ask4Size) {
        this.ask4Size = ask4Size;
    }

    public double getAsk5Price() {
        return ask5Price;
    }

    public void setAsk5Price(double ask5Price) {
        this.ask5Price = ask5Price;
    }

    public double getAsk5Size() {
        return ask5Size;
    }

    public void setAsk5Size(double ask5Size) {
        this.ask5Size = ask5Size;
    }

    public double getBid1Price() {
        return bid1Price;
    }

    public void setBid1Price(double bid1Price) {
        this.bid1Price = bid1Price;
    }

    public double getBid1Size() {
        return bid1Size;
    }

    public void setBid1Size(double bid1Size) {
        this.bid1Size = bid1Size;
    }

    public double getBid2Price() {
        return bid2Price;
    }

    public void setBid2Price(double bid2Price) {
        this.bid2Price = bid2Price;
    }

    public double getBid2Size() {
        return bid2Size;
    }

    public void setBid2Size(double bid2Size) {
        this.bid2Size = bid2Size;
    }

    public double getBid3Price() {
        return bid3Price;
    }

    public void setBid3Price(double bid3Price) {
        this.bid3Price = bid3Price;
    }

    public double getBid3Size() {
        return bid3Size;
    }

    public void setBid3Size(double bid3Size) {
        this.bid3Size = bid3Size;
    }

    public double getBid4Price() {
        return bid4Price;
    }

    public void setBid4Price(double bid4Price) {
        this.bid4Price = bid4Price;
    }

    public double getBid4Size() {
        return bid4Size;
    }

    public void setBid4Size(double bid4Size) {
        this.bid4Size = bid4Size;
    }

    public double getBid5Price() {
        return bid5Price;
    }

    public void setBid5Price(double bid5Price) {
        this.bid5Price = bid5Price;
    }

    public double getBid5Size() {
        return bid5Size;
    }

    public void setBid5Size(double bid5Size) {
        this.bid5Size = bid5Size;
    }
}
