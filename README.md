# Compialation instructions
``` shell
sudo apt-get install ant
mkdir Vision
cd Vision
git clone git://github.com/Itseez/opencv.git
cd opencv
mkdir build
cd build
cmake -DBUILD_SHARED_LIBS=OFF ..
make -j8
```
copy .so module to any of the path : /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib

