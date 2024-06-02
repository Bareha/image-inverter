# Overview
This Java program converts an image to its negative by inverting its colors.

# Functions
- Image is read
- Height and width of image are found out
- Value of pixel's ARGB is extracted by nested for loops
- Values of A, R, G and B are separated from pixel's ARGB
- The colors are inverted by subtracting the values of R, G, and B from 255
- Value of pixel's ARGB is modified with the new R, G and B values
- New pixel is set in the image
- Modified image is saved as a different file
