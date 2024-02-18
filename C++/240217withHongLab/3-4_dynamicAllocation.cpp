#include <iostream>

using namespace std;
int kMaxStr = 100;

int Min(int a, int b) {
  return a < b ? a : b;
}
int main() {
  char str1[] = "Hello World!";
  char str2[kMaxStr];
  // str2 = str1; 복사 오류

  // dest, src (복사할 메모리 크기 주의 안내)
  memcpy(str2, str1, Min(sizeof(str1), sizeof(str2)));
  cout << str2 << endl; // Hello World!
  
  // 동적 할당
  char *dynamic_array = new char[kMaxStr];
  // 주의: 동적 할당 메모리는 변수 사이즈가 포인터 사이즈임. (not 배열)
  memcpy(dynamic_array, str1, kMaxStr);
  cout << dynamic_array << endl;

  cout << str1 << " " << str2 << " " << dynamic_array << endl;
  // 정적 배열은 stack, 동적 배열은 heap에 있어 차이가 남.
  cout << size_t(str1) << " " << size_t(str2) << " " << size_t(dynamic_array) << endl;

  delete[] dynamic_array; // 배열 삭제시 []
  // 지우지 않고 재할당시 잃어버림
  // dynamic_array = new char[원하는크기];
  // delete[] dynamic_array; 다시 지워줘야 함
  return 0;
} 
