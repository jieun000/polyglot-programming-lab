#include <iostream>

using namespace std;
class MyString {
  public: 
    MyString() {
      cout << "MyString()" << endl;
      size_ = 1;
      str_ = new char[size_];
    }
    // init_str이 유효한 메모리라고 가정
    MyString(const char *init_str) {
      cout << "MyString(const char *init_str)" << endl;
    
      // 1. 글자 수 먼저 확인
      size_ = 0;
      while (init_str[size_] != '\0') size_ ++;
      // 2. 글자 수가 0이 아니면 메모리 할당
      if(size_ > 0) str_ = new char[size_];
      // 3. 복사
      for(int i=0; i<size_; i++) str_[i] = init_str[i];
      // memcpy() 사용 가능
    }
    ~MyString() {
      cout << "Destructor" << endl;
      size_ = 0;
      if(str_) delete[] str_;
    }
    void Print() {
      for (int i=0; i< size_; i++) cout << str_[i];
      cout << endl;
    }
    void Resize(int new_size) {
      char *new_str = new char[new_size];
      // memcpy() 사용 가능
      for (int i = 0; i < (new_size < size_ ? new_size : size_); i++) {
        new_str[i] = str_[i];
      }
      delete[] str_;
      str_ = new_str;
      size_ = new_size;
    }
    void Append(MyString *app_str) {// 같은 타입을 매개변수로 사용 가능
      int old_size = size_;
      Resize(size_ + app_str-> size_);
      for(int i=old_size; i<size_; i++) {
        cout << i << " " << i - old_size << endl;
        str_[i] = app_str->str_[i - old_size];
      }
    }
  private:
    int size_ = 0;        // m_size
    char *str_ = nullptr; // m_str 
};
int main() {
  MyString str1("ABCDE"); // 생성자 이용
  MyString str2("123"); 

  str1.Print();
  str1.Append(&str2); // 주소 넣기
  str1.Print();

  return 0;
} 
