package taintedmagic.client.renderer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;
import taintedmagic.client.model.ModelThaumicDisassembler;
import taintedmagic.common.items.tools.ItemThaumicDisassembler;

@SideOnly(Side.CLIENT)
public class RenderItemThaumicDisassembler
  implements IItemRenderer
{
  public ModelThaumicDisassembler thaumicDisassembler = new ModelThaumicDisassembler();
  
  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type)
  {
    return true;
  }
  
  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper)
  {
    return true;
  }
  
  public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data)
  {
    int light = 15728880;
    int lightmapX = light % 65536;
    int lightmapY = light / 65536;
    if ((type == IItemRenderer.ItemRenderType.EQUIPPED) || (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON))
    {
      OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapX, lightmapY);
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    }
    if ((item.getItem() instanceof ItemThaumicDisassembler))
    {
      OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapX, lightmapY);
      GL11.glPushMatrix();
      GL11.glScalef(1.4F, 1.4F, 1.4F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      if (type == IItemRenderer.ItemRenderType.EQUIPPED)
      {
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapX, lightmapY);
        GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(50.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        GL11.glTranslatef(0.0F, -0.4F, 0.4F);
      }
      else if (type == IItemRenderer.ItemRenderType.INVENTORY)
      {
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapX, lightmapY);
        GL11.glRotatef(225.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(45.0F, -1.0F, 0.0F, -1.0F);
        GL11.glScalef(0.6F, 0.6F, 0.6F);
        GL11.glTranslatef(0.0F, -0.2F, 0.0F);
      }
      else
      {
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapX, lightmapY);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, -0.7F, 0.0F);
      }
      Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("taintedmagic:textures/models/ThaumicDisassembler.png"));
      this.thaumicDisassembler.render(0.0625F);
      GL11.glPopMatrix();
    }
  }
}
