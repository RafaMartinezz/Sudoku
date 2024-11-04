# 3x3 Submatrix Coordinate Finder

This Java project demonstrates how to locate the origin coordinates of each 3x3 submatrix within an 11x11 matrix. The matrix is initialized with labeled coordinates for each cell, and three different approaches are used to determine and print the top-left (origin) coordinates of every 3x3 submatrix within the larger matrix.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Class Structure](#class-structure)
- [Approaches](#approaches)
- [Example Output](#example-output)
- [Explanation](#explanation)

---

## Overview

The program initializes an 11x11 matrix, where each cell is labeled with its row and column coordinate (e.g., "0-0" for the top-left cell). Then, three different approaches are used to calculate and display the top-left (origin) coordinates of each 3x3 submatrix within the larger matrix.

## Purpose

This project serves as a **learning exercise** in:
- Working with **2D arrays** and accessing cells by row and column coordinates.
- Using **nested loops** to traverse a matrix and dynamically calculate submatrix origins.
- Experimenting with different logical approaches to achieve the same goal, demonstrating versatility in algorithm design.

## Features

- **Matrix Initialization**: The program sets up an 11x11 matrix with each cell labeled by its coordinates.
- **3x3 Submatrix Origins**: Finds and displays the top-left coordinates of each 3x3 submatrix in the 11x11 matrix.
- **Multiple Calculation Approaches**: Three distinct approaches demonstrate different ways to calculate submatrix origins, each yielding the same result.

## Class Structure

- **`App`**: Contains the main method to initialize the matrix, print it, and calculate the coordinates of each 3x3 submatrix origin using three approaches.

## Approaches

The program uses three different approaches to calculate and print the coordinates of each 3x3 submatrix:

1. **Incremental Approach**: 
   - This approach increments row and column indices by 3 in each loop iteration to find the origin coordinates of each 3x3 submatrix.

2. **Row and Column Steps**:
   - Here, `m` and `n` are calculated as the total number of 3x3 submatrices horizontally and vertically. Nested loops are used to step through the matrix, incrementing by 3 to find each submatrix origin.

3. **Horizontal and Vertical Regions**:
   - Similar to the second approach, but with renamed variables (`franjasHorizontales` and `franjasVerticales`) to clarify that the matrix is divided into distinct horizontal and vertical regions.

## Example Output

The program outputs the matrix and the calculated coordinates for each 3x3 submatrix:

```plaintext
Matriz original
0-0    0-1    0-2    ...    0-10
1-0    1-1    1-2    ...    1-10
...
10-0   10-1   10-2   ...    10-10

coordenadas origen Submatrices 3x3
(0,0) (0,3) (0,6) (0,9)
(3,0) (3,3) (3,6) (3,9)
(6,0) (6,3) (6,6) (6,9)
(9,0) (9,3) (9,6) (9,9)

otro razonamiento
(0,0) (0,3) (0,6) (0,9)
(3,0) (3,3) (3,6) (3,9)
(6,0) (6,3) (6,6) (6,9)
(9,0) (9,3) (9,6) (9,9)

otro razonamiento similar, hay muchos ....
(0,0) (0,3) (0,6) (0,9)
(3,0) (3,3) (3,6) (3,9)
(6,0) (6,3) (6,6) (6,9)
(9,0) (9,3) (9,6) (9,9)
```

## Explanation

Each approach effectively finds the top-left (origin) coordinates for each 3x3 submatrix by using different looping techniques:
- **Incremental Approach**: Simple and intuitive, increments by 3 in each loop to locate 3x3 regions.
- **Row and Column Steps**: Calculates the number of 3x3 submatrices and uses nested loops to step through them.
- **Horizontal and Vertical Regions**: Divides the matrix into horizontal and vertical regions to identify submatrix origins, illustrating a similar but differently named approach.