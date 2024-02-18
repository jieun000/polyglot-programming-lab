#include <iostream>
#include "4-4_myClass.h"

MyClass::MyClass() {
  cout << "MyClass()" << endl;
}

MyClass::MyClass(int number) {
  cout << "MyClass(int number)" << endl;
  this->number_ = number;
}

MyClass::~MyClass() {
  cout << "~MyClass()" << endl;
}

void MyClass::Increment(int a) {
  number_ += a;
}

void MyClass::Print() {
  cout << number_ << endl;
}