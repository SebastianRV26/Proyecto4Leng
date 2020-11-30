cmake_minimum_required(VERSION 3.17)
project(BackendProject4Leng C)

set(CMAKE_C_STANDARD 11)

find_package(SFML 2.5 COMPONENTS graphics system)
add_executable(BackendProject4Leng main.c)

target_link_libraries(BackendProject4Leng sfml-graphics sfml-system csfml-graphics csfml-system)