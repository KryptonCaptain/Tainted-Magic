package taintedmagic.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelThaumicDisassembler
  extends ModelBase
{
  ModelRenderer Shape1;
  ModelRenderer Shape2;
  ModelRenderer Shape5;
  ModelRenderer Shape6;
  ModelRenderer Shape7;
  ModelRenderer Shape9;
  ModelRenderer Shape16;
  ModelRenderer Shape10;
  ModelRenderer Shape3;
  ModelRenderer Shape11;
  ModelRenderer Shape4;
  ModelRenderer Shape12;
  ModelRenderer Shape13;
  ModelRenderer Shape14;
  ModelRenderer Shape15;
  ModelRenderer Shape8;
  
  public ModelThaumicDisassembler()
  {
    this.textureWidth = 64;
    this.textureHeight = 32;
    
    this.Shape1 = new ModelRenderer(this, 0, 10);
    this.Shape1.addBox(0.0F, -1.0F, -3.0F, 1, 16, 1);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 34, 9);
    this.Shape2.addBox(-0.5F, -3.5F, -3.5F, 2, 5, 2);
    this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 42, 0);
    this.Shape5.addBox(0.0F, -4.0F, -4.0F, 1, 2, 10);
    this.Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape5.setTextureSize(64, 32);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 24, 0);
    this.Shape6.addBox(-5.0F, -5.7F, -5.5F, 3, 3, 6);
    this.Shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape6.setTextureSize(64, 32);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.7853982F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(-0.5F, -6.0F, -7.0F, 2, 2, 8);
    this.Shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape7.setTextureSize(64, 32);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 60, 0);
    this.Shape9.addBox(0.0F, -0.5333334F, -9.6F, 1, 3, 1);
    this.Shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape9.setTextureSize(64, 32);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, -0.7853982F, 0.0F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 58, 0);
    this.Shape16.addBox(0.0F, -9.58F, -4.0F, 1, 5, 2);
    this.Shape16.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape16.setTextureSize(64, 32);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.7853982F, 0.0F, 0.0F);
    this.Shape10 = new ModelRenderer(this, 12, 0);
    this.Shape10.addBox(-0.5F, -8.2F, -2.5F, 2, 1, 1);
    this.Shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape10.setTextureSize(64, 32);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, 0.7853982F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 56, 0);
    this.Shape3.addBox(0.0F, -2.44F, -6.07F, 1, 2, 3);
    this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 42, 14);
    this.Shape11.addBox(-0.5F, -0.5F, 3.5F, 2, 1, 1);
    this.Shape11.setRotationPoint(0.0F, -4.0F, 0.0F);
    this.Shape11.setTextureSize(64, 32);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 30, 16);
    this.Shape4.addBox(-0.5F, -3.5F, -1.5F, 2, 1, 4);
    this.Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 42, 12);
    this.Shape12.addBox(-0.5F, -4.5F, 1.5F, 2, 1, 1);
    this.Shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape12.setTextureSize(64, 32);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
    this.Shape13 = new ModelRenderer(this, 4, 10);
    this.Shape13.addBox(0.0F, -5.3F, 0.0F, 1, 1, 7);
    this.Shape13.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape13.setTextureSize(64, 32);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
    this.Shape14 = new ModelRenderer(this, 60, 0);
    this.Shape14.addBox(0.0F, -4.0F, 6.0F, 1, 1, 1);
    this.Shape14.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape14.setTextureSize(64, 32);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
    this.Shape15 = new ModelRenderer(this, 26, 9);
    this.Shape15.addBox(-0.5F, 15.0F, -3.5F, 2, 4, 2);
    this.Shape15.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape15.setTextureSize(64, 32);
    this.Shape15.mirror = true;
    setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 37, 0);
    this.Shape8.addBox(0.0F, -2.0F, -2.0F, 1, 4, 1);
    this.Shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape8.setTextureSize(64, 32);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(float size)
  {
    GL11.glPushMatrix();
    
    this.Shape3.render(size);
    this.Shape5.render(size);
    this.Shape9.render(size);
    this.Shape16.render(size);
    this.Shape14.render(size);
    
    GL11.glPopMatrix();
    
    this.Shape1.render(size);
    this.Shape2.render(size);
    this.Shape6.render(size);
    this.Shape7.render(size);
    this.Shape13.render(size);
    this.Shape10.render(size);
    this.Shape11.render(size);
    this.Shape4.render(size);
    this.Shape12.render(size);
    this.Shape15.render(size);
    this.Shape8.render(size);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
