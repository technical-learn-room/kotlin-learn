## padStart

### 1.

#### 함수 선언  
```kotlin
fun CharSequence.padStart(
    length: Int,
    padChar: Char = ' ',
): CharSequence
```

#### 함수 정의
```kotlin
public fun CharSequence.padStart(length: Int, padChar: Char = ' '): CharSequence {
    if (length < 0)
        throw IllegalArgumentException("Desired length $length is less than zero.")
    if (length <= this.length)
        return this.subSequence(0, this.length)

    val sb = StringBuilder(length)
    for (i in 1..(length - this.length))
        sb.append(padChar)
    sb.append(this)
    return sb
}
```
- `IntelliJ`에서 제공하는 함수 정의를 가져왔습니다.  
  코틀린에서는 `public`이 기본임에도 불구하고 함수에 `public` 접근제어지시자를 붙인 이유는 알 수 없습니다.  

#### 사용 예제
```kotlin
println("[${"J".padStart(3)}]")
// [  J]

println("[${"Jin".padStart(2)}]")
// [Jin]

println("[${"Jin".padStart(5, '*')}]")
// [**Jin]
```

---

### 2.

#### 함수 선언
```kotlin
fun String.padStart(
    length: Int,
    padChar: Char = ' ',
): String
```

#### 함수 정의
```kotlin
public fun String.padStart(length: Int, padChar: Char = ' '): String =
    (this as CharSequence).padStart(length, padChar).toString()
```

#### 사용 예제
- `1`과 같습니다.
