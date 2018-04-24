
class complex:
    
    def __init__(self, real, imaginary):
        
        self.real = real
        
        self.imaginary = imaginary

    def __add__(self, other):
        
        if isinstance(other, float):
            
            return complex(self.real + other, self.imaginary)
        
        elif isinstance(other, complex):
            
            return complex(self.real + other.real, self.imaginary + other.imaginary)
        
        else:
            
            raise TypeError

    def __truediv__(self, other):
        
        if isinstance(other, float):
            
            return complex(self.real / other, self.imaginary / other)
        
        elif isinstance(other, complex):
            
            conjugateReal = other.real
            
            conjugateImaginary = (-1) * other.imaginary
            
            realNumerator = self.real * conjugateReal + (-1) * self.imaginary * conjugateImaginary
            
            imaginaryNumerator = self.real * conjugateImaginary + self.imaginary * conjugateReal
            
            denominator = (other.real * conjugateReal) + (other.real * conjugateImaginary) + (other.imaginary * conjugateReal) + ((-1) * other.imaginary * conjugateImaginary)
            
            return complex(realNumerator / denominator, imaginaryNumerator / denominator)
        
        else:
            
            raise TypeError

    def __mul__(self, other):
        
        if isinstance(other, float):
            
            return complex(self.real * other, self.imaginary * other)
        
        elif isinstance(other, complex):
            
            realPart = self.real * other.real + (-1) * self.imaginary * other.imaginary
            
            imaginaryPart = other.real * self.imaginary + self.real * other.imaginary
            
            return complex(realPart, imaginaryPart)
        
        else:
            
            raise TypeError    
    
    def __sub__(self, other):
        
        if isinstance(other, float):
            
            return complex(self.real - other.real, self.imaginary)
        
        elif isinstance(other, complex):
            
            return complex(self.real - other.real, self.imaginary - other.imaginary)
        
        else:
            
            raise TypeError

    
    def __rsub__(self,other):
        
        return complex(other, 0) - self

    def __rmul__(self, other):
        
        return complex(other, 0) * self
    
    def __radd__(self, other):
        
        return complex(other, 0) + self

    def __rtruediv__(self, other):
        
        return complex(other, 0) / self

    def __str__(self):
        
        return '(' + str(self.real) + ' + ' + str(self.imaginary) + 'i)'

    

if __name__ == '__main__':
    
    a = complex(1, 2)
    
    b = complex(3, 4)

    i = 2.0

    print('%s + %s = %s' % (a, b, a + b))
    
    print('%s - %s = %s' % (a, b, a - b))
    
    print('%s * %s = %s' % (a, b, a * b))
    
    print('%s / %s = %s\n' % (a, b, a / b))
    
    
    print('%s + %s = %s' % (a, i, a + i))
    
    print('%s - %s = %s' % (a, i, a - i))
    
    print('%s * %s = %s' % (a, i, a * i))
    
    print('%s / %s = %s\n' % (a, i, a / i))

    
    print('%s + %s = %s' % (i, a, i + a))
    
    print('%s - %s = %s' % (i, a, i - a))
    
    print('%s * %s = %s' % (i, a, i * a))
    
    print('%s / %s = %s' % (i, a, i / a))











    
