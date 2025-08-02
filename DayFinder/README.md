# Day Finder 

This is a Java console-based program that determines the **day of the week** for any valid date using **Zeller’s Congruence** — a mathematical algorithm designed to compute the day for any given date in the Gregorian calendar.

---

##  How Zeller’s Congruence Works

Zeller’s Congruence is an algorithm devised by Christian Zeller to calculate the **day of the week** for any given date. The formula for dates in the Gregorian calendar is:
h = (q + [13(m + 1)/5] + K + [K/4] + [J/4] + 5J) mod 7.

Where:
- `h` is the day of the week (0 = Saturday, 1 = Sunday, ..., 6 = Friday)
- `q` is the day of the month
- `m` is the month (March = 3, ..., January = 13, February = 14)
- `K` is the year of the century (`year % 100`)
- `J` is the zero-based century (`year / 100`)

> January and February are treated as months **13 and 14** of the **previous year**.

---

## Logic Used in This Program

1. **Input Handling**
   - Takes three integer inputs: day, month, and year.
   - Validates the date (including leap years) before computation.

2. **Date Adjustment**
   - If the month is January or February, the program adds 12 to the month and subtracts 1 from the year.

3. **Day Calculation**
   - Applies Zeller’s Congruence to calculate the numeric value of the weekday.
   - Maps the result to its corresponding day name.

4. **Validation**
   - Checks for invalid dates using a `isValidDate()` function.
   - Includes leap year logic in `isLeapYear()`.

---

## Features
  - Validates dates from 0000 AD onwards.
  - Leap year handling.
  - Calculates day for any given date using Zeller’s formula.
  - Beginner-friendly logic and code structure.


