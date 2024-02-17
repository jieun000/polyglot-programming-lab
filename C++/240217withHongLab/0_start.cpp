// iostream(input + output + stream)라는 헤더를 포함(inclued)
#include <iostream>

using namespace std;  // std라는 이름 공간을 사용, std::cout(std::을 생략할테니 cout찾기)

// int(반환하는 값의 자료형) main함수(파라미터)
int main() { // 운영체제가 가장 먼저 실행하는 함수가 main.
     // cout(character+출력) 자료형 알아서 구현함.
     // << stream으로 흘려 보냄. 
     // << endl(라인의 끝) 줄 바꿈 처리해줌.
    cout << "Hello, C++ World" << endl;
    
    printf("Hello World by printf"); // 설정 복잡함
    return 0; // 0: 운영체제에게 이 프로그램이 잘 끝났다는 신호.
} 
