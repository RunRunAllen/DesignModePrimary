package com.example.designmode.Builder;

/**
 * creation date: 2019-11-20 14:53
 * description ： Builder变种模式
 */
public class ComputerIml extends Computer {

    private String mouse;
    private String keybord;
    private String color;

    private ComputerIml(ComputerBuilder computerBuilder) {
        this.mouse = computerBuilder.mouse;
        this.color = computerBuilder.color;
        this.keybord = computerBuilder.keybord;
        this.screen = computerBuilder.screen;
    }

    public static class ComputerBuilder {
        private String mouse;
        private String keybord;
        private String color;
        private String screen;

        public ComputerBuilder(String screen) {
            this.screen = screen;
        }

        public ComputerBuilder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder keybord(String keybord) {
            this.keybord = keybord;
            return this;
        }

        public ComputerBuilder color(String color) {
            this.color = color;
            return this;
        }

        public ComputerIml build() {
            return new ComputerIml(this);
        }
    }

}
