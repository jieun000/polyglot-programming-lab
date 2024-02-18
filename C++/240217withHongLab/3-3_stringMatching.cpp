#include <iostream>

using namespace std;

// 모든 문자열 배열의 길이가 동일하다고 가정.
const int kMaxStr = 100;

bool IsEqual(const char *str1, const char *str2) {
  // 크기 출력 확인(배열 크기 아님 주의) - 문자열 길이를 별도로 저정해야함!
  // cout << sizeof(str1) << " " << sizeof(str2) << " " << endl;
  // exit(-1);

  // 디버깅 힌트: 문자를 정수로 바꿔서 출력해보기
  for(int i=0; i<kMaxStr; i++) {
    cout << sizeof(str1[i]) << " " << sizeof(str2[i]) << " " << endl;
    // 힌트: ==, != 비교 연산자
    if(str1[i] != str2[i]) return false;
    // 힌트: 문자열 종료 조건
    if(str1[i] == '\0') return true;
  }
  return true;
};

int main() {
  const char str1[kMaxStr] = "stop";
  while(1) {
    char str2[kMaxStr];
    cin >> str2;
    if(IsEqual(str1, str2)) {
      cout << "종료합니다." << endl;
      break;
    } else {
      cout << "계속합니다." << endl;
    }
  }
  return 0;
} 
