package com.softserve.service;

/**
 * Interface, which compares input math figures
 * on opportunity to place one to another.
 */
public interface Placeable {

    int place(Object firstFigure, Object secondFigure);
}