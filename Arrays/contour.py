import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

x = np.linspace(-2, 2, 400)
y = np.linspace(-2, 2, 400)
x, y = np.meshgrid(x, y)
z = x**2 - y**2

plt.contour(x, y, z, 50, cmap='viridis')
plt.title('Contour plot of $f(x, y) = x^2 - y^2$')
plt.xlabel('x')
plt.ylabel('y')
plt.grid(True)
plt.show()