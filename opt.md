

## doc (no use)
jar cvf mee-excel-1.0.1-javadoc.jar -C site/apidocs .

## sign
+ use win cmd
certUtil -hashfile mee-excel-1.0.1.jar md5 >> mee-excel-1.0.1.jar.md5
certUtil -hashfile mee-excel-1.0.1.jar sha1 >> mee-excel-1.0.1.jar.sha1

certUtil -hashfile mee-excel-1.0.1-sources.jar md5 >> mee-excel-1.0.1-sources.jar.md5
certUtil -hashfile mee-excel-1.0.1-sources.jar sha1 >> mee-excel-1.0.1-sources.jar.sha1

certUtil -hashfile mee-excel-1.0.1-javadoc.jar md5 >> mee-excel-1.0.1-javadoc.jar.md5
certUtil -hashfile mee-excel-1.0.1-javadoc.jar sha1 >> mee-excel-1.0.1-javadoc.jar.sha1

certUtil -hashfile mee-excel-1.0.1.pom md5 >> mee-excel-1.0.1.pom.md5
certUtil -hashfile mee-excel-1.0.1.pom sha1 >> mee-excel-1.0.1.pom.sha1

## clear content

+ use git bash 
sed -i '1d;3d' mee-excel-1.0.1.jar.md5
sed -i '1d;3d' mee-excel-1.0.1.pom.md5
sed -i '1d;3d' mee-excel-1.0.1-javadoc.jar.md5
sed -i '1d;3d' mee-excel-1.0.1-sources.jar.md5

sed -i '1d;3d' mee-excel-1.0.1.jar.sha1
sed -i '1d;3d' mee-excel-1.0.1.pom.sha1
sed -i '1d;3d' mee-excel-1.0.1-javadoc.jar.sha1
sed -i '1d;3d' mee-excel-1.0.1-sources.jar.sha1

