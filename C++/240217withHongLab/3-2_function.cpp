// #include <iostream>

// using namespace std;

// // 함수 (선언과 정의 분리 가능)
// int Add(int a, int b) {
//   return a + b;
// }
// void Add(int a, int b, int *c) {
//   *c = a + b;
// }

// int main() {
//   cout << Add(1, 2) << endl;
//   int sum;
//   Add(4, 5, &sum);
//   cout << sum << endl;

//   return 0;
// } 



#include <iostream>

using namespace std;

// 함수 (선언과 정의 분리 가능)
int Add(int a, int b); // 선언만.
void Add(int a, int b, int *c) {
  *c = a + b; // 반환값을 여러 개 하고싶을 때 포인터를 이용하면 유용.
}

int main() {
  cout << Add(1, 2) << endl;
  int sum;
  Add(4, 5, &sum);
  cout << sum << endl;

  return 0;
} 

 // 정의. 
int Add(int a, int b) {
  return a + b;
}