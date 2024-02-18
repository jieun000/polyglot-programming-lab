#include <iostream>
#include "4-4_myClass.cpp"

int main() {
  MyClass my_class1;
  MyClass my_class2(123);

  my_class1.Print();
  my_class2.Print();
  my_class1.Increment(1);
  my_class1.Print();
  
  return 0;
} 
