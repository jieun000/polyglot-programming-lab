#include <iostream>

using namespace std;  
int main() {
  for (int i=5; i<=10; i++) {
    cout << i << " ";
  }
  cout << endl;



  int my_array[] = {1, 2, 3, 4, 5, 7, 9};
  // 전체 크기 / int 크기
  for (int i=0; i<sizeof(my_array)/sizeof(int); i++) {
    cout << my_array[i] << " ";
  }
  cout << endl;



  char my_string[] = "Hello\0, World";
  // 문자열을 한 글자씩 출력하기
  // cout << my_string << endl; 사용 금지
  // 힌트: sizeof(), '\0', bread
  // for (int i=0; i<sizeof(my_string); i++) {
  //   if (my_string[i] == '\0') break;
  //   cout << my_string[i];
  // }
  // cout << endl;
  for (int i=0; my_string[i]!='\0'; i++) {
    cout << my_string[i];
  }
  cout << endl;

  // while
  int i = 0;
  while (i < 10) {
    cout << i << " ";
    i++; // 무한 반복 주의
  } 
  cout << endl;

  i = 0;
  while(true) { // while(1)
    cout << i << " ";
    i++;
    if(i>=10) break;
  }
  cout << endl;

  // 런타임오류 주의
  // while문으로 문자열 한 글자씩 출력하기
  // 힌트 && logical and
  char my_string2[] = "Hello\0, World";
  i = 0;
  while (my_string2[i] != '\0') {
    cout << my_string2[i];
    i++;
  }
  cout << endl;

  return 0;
} 
