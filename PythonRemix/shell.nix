{ pkgs ? import <nixpkgs> {} }:
  pkgs.mkShell {
    packages = [ pkgs.python310 pkgs.python310Packages.pytest];
}

