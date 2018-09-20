// Date: 15-3-2015 14:28:05
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMushroomHelmet extends ModelBiped {

    public ModelRenderer bottom;
    public ModelRenderer top;
  
  public ModelMushroomHelmet()
  {
	super();
    textureWidth = 64;
    textureHeight = 64;
    float x = 4f;
    float y = 8f;
    float z = 4f;
    bottom = new ModelRenderer(this, 0, 20);
    bottom.addBox(-x, -y, -z, 8, 8, 8);
    bottom.setRotationPoint(0, 0, 0);
    bottom.setTextureSize(64, 64);
    bottom.mirror = true;
    top = new ModelRenderer(this, 0, 0);
    top.addBox(-x, -y, -z, 12, 8, 12);
    top.setRotationPoint(-2, -8, -2);
    top.setTextureSize(64, 64);
    top.mirror = true;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    bottom.render(f5);
    top.render(f5);
  }
  
  public void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationPoints(){
	  float x = bipedHead.rotationPointX;
	  float y = bipedHead.rotationPointY;
	  float z = bipedHead.rotationPointZ;
	  top.rotationPointX = x - 2;
	  bottom.rotationPointX = x;
	  top.rotationPointY = y - 8;
	  bottom.rotationPointY = y;
	  top.rotationPointZ = z - 2;
	  bottom.rotationPointZ = z;
  }
  
  @Override
  public void setRotationAngles(float f1, float f2, float f3, float f4, float f5, float f6, Entity entity){
	  super.setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
	  setRotation(bottom, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
	  setRotation(top, bipedHead.rotateAngleX, bipedHead.rotateAngleY, bipedHead.rotateAngleZ);
	  setRotationPoints();
  }

}
