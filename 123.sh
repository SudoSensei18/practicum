#!/bin/bash

v1=0
v2=0
op=0

read_input(){

	read -p "$1" v1
	read -p "$2" v2
	read -p "$3" op

}

read_inputs "enter v1" "enter v2" "enter operation +,-,x,/"
