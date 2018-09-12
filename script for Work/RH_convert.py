"""
By Antoine equation
https://en.wikipedia.org/wiki/Antoine_equation

For water @ 1~100(C)

log(P) = A - (B/C+T)
A: 8.07131
B: 1730.63
C: 233.426
"""

import math

A= 8.07131
B= 1730.63
C= 233.426

# T1=100%RH Temperature(C), desired_RH(%)

T1 = 80
RH = 80

# Temperature to 100%RH
P = math.pow(10, A-(B/(C+T1)))

# P convert to T2=humidifier's T
Humidify_P = P * RH/100
T2 = B/(A - math.log10(Humidify_P)) - C

# output desired_RH@T2  
print(T2)
