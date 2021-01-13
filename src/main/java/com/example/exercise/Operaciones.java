package com.example.exercise;

import com.fasterxml.jackson.annotation.JsonTypeId;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class Operaciones {


    Float num1,num2,res;
    @ApiOperation("Makes a sum")
    @GetMapping("/suma/{num1}/{num2}")
    public String getSuma(@PathVariable("num1") Float num1,@PathVariable("num2")Float num2){
    return "La suma es: "+(num1+num2);

    }

    @ApiOperation("Makes a rest")
    @GetMapping("/resta/{num1}/{num2}")
    public String getResta(@PathVariable("num1") Float num1,@PathVariable("num2")Float num2){
        return "La resta es: "+(num1-num2);

    }
    @ApiOperation("Makes a multiplication")
    @GetMapping("/multiplicacion/{num1}/{num2}")
    public String getmultiplicacion(@PathVariable("num1") Float num1,@PathVariable("num2")Float num2){
        return "La multiplicacion es: "+(num1*num2);

    }


    public Float getNum1() {
        return num1;
    }

    public void setNum1(Float num1) {
        this.num1 = num1;
    }

    public Float getNum2() {
        return num2;
    }

    public void setNum2(Float num2) {
        this.num2 = num2;
    }

    public Float getRes() {
        return res;
    }

    public void setRes(Float res) {
        this.res = res;
    }
}
