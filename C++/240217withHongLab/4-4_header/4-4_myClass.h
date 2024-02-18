#ifndef MY_CLASS_H // 정의되어 있지 않다면
#define MY_CLASS_H // 정의한다.

using namespace std;

class MyClass {
    public:
        MyClass();
        MyClass(int number);
        ~MyClass();

        void Increment(int a);
        void Print();

    private:
        int number_ = 0;
};

#endif