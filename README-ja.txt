��Angel Falls  

���͂��߂�
�I�[�v���\�[�X�Ńv���W�F�N�g���K���g�`���[�g�ŊǗ��ł���\�t�g�E�F�A�Ƃ��āAOpenProj������܂��B
�������Ȃ���A�����e�i���X���S������Ă��Ȃ��B�o�O������(���������r���h�ł��Ȃ�)�Ȃ�OSS�Ƃ��Ă͖��
������܂��BAngel Falls��OpenProj���x�[�X�ɁA�o�O�t�B�b�N�X��@�\�g�����s�����v���W�F�N�g�Ǘ��\�t�g�E�F�A�ł��B

MS Project�Ɠ����t�B�[���Ńv���W�F�N�g���Ǘ����邱�Ƃ��ł��܂��B�܂��ATrac/Redmin�Ȃǂ̃`�P�b�g�V�X�e���Ƃ�
�A�g������ɓ���Ă��܂��B


���r���h
��������
Angel Falls�́AMaven���|�W�g���ɂȂ�jar�𗘗p���܂��B���L�̃R�}���h�ɂ��jar��Maven���|�W�g���փC���X�g�[�����Ă��������B

[Windows]
> install-jar.bat

[Linux]
$ install-jar.sh

�����r���h
���L�̃R�}���h�őS�Ẵ��W���[�����r���h����܂��B

$ mvn install

�����p�b�P�[�W�쐬
���L�̃R�}���h�����s����ƁAAngelFalls-x.x.x.zip�Ƃ������O�Ŕz�z�t�@�C�����쐬����܂��B

$ cd pkg
$ mvn assembly:assembly

Java Web Start�p�̃t�@�C���𐶐�����ɂ́Apkg�f�B���N�g����

$ mvn webstart:jnlp

�Ɠ��͂��Ă��������Btarget/jnlp�f�B���N�g���ɏ����ς݂�jar��jnlp�t�@�C�����쐬����܂��B

�������s
pkg/target�f�B���N�g���ɐ������ꂽzip��W�J���āAbin�f�B���N�g���� angelfalls.bat or kanon �X���v�g�����s���܂��B


���ӎ�
Angel Falls��SennaProjity�ɂ��J�����ꂽOpenProj�����ƂɊJ������Ă��܂��B
OpenProj�ɂ��ẮAhttp://openproj.org/���������������B
