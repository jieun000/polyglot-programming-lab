#include <iostream>

using namespace std;
class MyClass {
  // 생성자
  public: MyClass() {
    cout << "MyClass()" << endl;
    cout << "this " << this << endl;
  }
  MyClass(int number) {
    cout << "MyClass(int number)" << endl;
    // this pointer 소개
    this->number_ = number;
    cout << "this " << this << endl;
  }
  // 소멸자
  ~MyClass() {
    cout << "~MyClass()" << endl;
  }
  void Increment(int a) {
    number_ += a;
  }
  void Print() {
    cout << number_ << endl;
  }
  private: int number_ = 0; // 초기값 m_number
};

int main() {
  MyClass my_class1;
  MyClass my_class2(123);
  cout << &my_class1 << endl;
  cout << &my_class2 << endl;

  my_class1.Print();
  my_class1.Increment(1);
  my_class1.Print();
  my_class2.Print();
  my_class2.Increment(1);
  my_class2.Print();

  // 배열 사용 가능
  // 포인터 사용 가능 등 안내
  // 기본 자료형과 비교
  return 0;
} 
