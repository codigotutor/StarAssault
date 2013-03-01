package us.andresgarcia.starassault.utils;

import com.badlogic.gdx.tools.imagepacker.TexturePacker2;


public class TextureSetup {

	public static void main(String[] args) {
		TexturePacker2.process("../StarAssault-android/assets/images", "../StarAssault-android/assets/images/texture", "texture.pack");
	}
}
