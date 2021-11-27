## padEnd

### 1.

#### 함수 선언
```kotlin
fun CharSequence.padEnd(
    length: Int, 
    padChar: Char = ' '
): CharSequence
```

#### 사용 예제
```kotlin
println("[${"J".padEnd(3)}]")
// [J  ]

println("[${"Jin".padEnd(2)}]")
// [Jin]

println("[${"Jin".padEnd(5, '*')}]")
// [Jin**]
```

---

### 2.

#### 함수 선언
```kotlin
fun String.padEnd(
    length: Int,
    padChar: Char = ' ',
): String
```

#### 사용 예제
- `1`과 같습니다.
