#include <iostream>

using namespace std;

int main() {
  int a = 123;
  // address of 주소 연산자 & ampersand
  cout << a << " " << &a << endl;
  // 참고: python id()와 비교
  int *b = &a;
  
  // deference operator (역참조 연산자)
  cout << b << " " << *b << endl;
  *b = 567;
  cout << a << " " << b << " " << *b << endl;

  // 포인터 자체의 주소 크기와 자료형의 크기 (주소의 크기는 항상 동일하다.)
  double *c = nullptr; // 아무 주소도 가리키고 있지 않다는 의미로 초기화, 0도 많이 사용
  cout << sizeof(int) << " " << sizeof(double) << endl;
  cout << sizeof(int *) << " " << sizeof(double *) << endl;
  cout << a << endl;
  cout << sizeof(b) << " " << sizeof(c) << endl;

  cout << sizeof(size_t) << endl; // 8
  cout << size_t(b) << " " << size_t(b+1) << " " << size_t(b+2) << endl;
  cout << size_t(c) << " " << size_t(c+1) << " " << size_t(c+2) << endl;

  // sizeof(char) == 1 ,  char* e = 0; ,  e + 15는 몇 일까요?
  // char에 대해서 퀴즈 내기
  char *e = 0;
  cout << size_t(e+15) << endl;
  
  // 문자열, 배열 연결시키기
  int my_array[] = {23, 38, 56, 69, 74};
  char my_str[] {'H', 'e', 'l', 'l', 'o'};
  char *ptr = my_str; // 배열의 이름: 포인터
  cout << *(ptr + 1) << endl;
  
  return 0;
} 
