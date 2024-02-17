#include <iostream>

using namespace std;
int main() {
    int i; // 변수 정의
    i = 123; // 변수에 값 지정 (int는 4byte 사용함==정수형의 크기는 4)

    // sizeof 소개
    cout << i << ", int의 사이즈: " << sizeof(i) << endl; // sizeof(전체 메모리 크기 , not 원소 개수)
    cout << sizeof(int) << endl;
    cout << 123 + 4 << " " << sizeof(123 + 4) << endl; // 127 4

    float f = 3.14f; // 마지막 f 주의
    double d = 3.14;
    cout << f << " " << sizeof(f) << endl; // 4
    cout << d << " " << sizeof(d) << endl; // 8

    char c = 'c';
    char str[] = "Hello C++ World"; // std::string
    cout << c << " " << sizeof(c) << endl; // 1
    cout << str << " " << sizeof(str) << endl; // 16

    // 형 변환
    i = 3.14; // double을 int에 강제 저장
    cout << "int from double: " << i << endl; // 강제 int형 행(소수밑버림)

    f = 9.87654321; // f 뺀 double을 float에  강제 저장
    cout << "float from double: " << f << endl; // 강제 float형 행

    // 연산자
    i += 100; // 기존 i: 3
    i++;
    cout << i << endl; // 104

    // 불리언
    bool is_good = true; // 1
    is_good = false; // 0
    cout << is_good << endl; // 0
    cout << boolalpha << true << endl; // true
    cout << is_good << endl; // false(boolalpha 계속 적용)
    is_good = true;
    cout << noboolalpha << is_good << endl; // true
    // 논리 연산 몇 가지 소개 (참고 문서 사용)
    // https://en.cppreference.com/w/cpp/language/operator_precedence
    cout << boolalpha;
    cout << (true && true) << endl; // true
    cout << (true || false) << endl; // true

    // 비교 연산자
    cout << (1 > 3) << endl; // false
    cout << (3 == 3) << endl; // true
    cout << (i >= 3) << endl; // true
    cout << ('a' != 'c') << endl; // true
    cout << ('a' != 'a') << endl; // false

    // 영역(scope)
    i = 123;
    {
        int i = 345; // 더 좁은 영역의 다른 변수
        cout << "block scope: " << i << endl;
    }
    cout << "function scope: " << i << endl;

    return 0;
}