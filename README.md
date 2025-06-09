# 项目说明

这是一个基于 Java + Groovy 的 Gradle 多模块学习项目

# 项目结构

```shell
.
├── build.gradle
├── gradle
│   └── wrapper
├── gradle-external ------------------- （扩展模块）
│   ├── build.gradle
│   ├── gradle-client ----------- （Client 模块）
│   ├── gradle-common ----------- （Common 模块）
│   ├── gradle-integration ------ （Integration 模块）
│   └── gradle-util ------------- （Util 模块）
├── gradle-servers -------------------- （bootJar 多模块）
│   ├── build.gradle
│   ├── gradle-server1 ---------- （bootJar 模块 Server 1）
│   ├── gradle-server2 ---------- （bootJar 模块 Server 2）
│   └── gradle-server3 ---------- （bootJar 模块 Server 3）
├── gradlew
├── gradlew.bat
├── LICENSE
├── README.md
└── settings.gradle
```

# Gradle 依赖项的范围

- `api` 编译和运行时都需要的依赖项，传递给子模块
- `implementation` 编译和运行时都需要的依赖项
- `compileOnly` 仅编译所需的依赖项，不包含在 runtime 或发布中
- `compileOnlyApi` 依赖项仅需要用于编译，传递给子模块
- `runtimeOnly` 仅在运行时需要的依赖项，不包含在 compile Classpath 中
- `testImplementation` 编译和运行测试所需的依赖项
- `testCompileOnly` 仅测试编译所需的依赖项
- `testRuntimeOnly` 仅运行测试所需的依赖项