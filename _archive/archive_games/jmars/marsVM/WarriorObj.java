/*-
 * Copyright (c) 1998 Brian Haskin jr.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *
 */

/*
 * Loads the warriors from disk
 *
 */
 
package marsVM;

import assembler.Assembler;
 
import java.awt.Color;
import java.io.Reader;

public class WarriorObj
{
	public Memory wInst[];
	public int wOffset;
	protected int[] pSpace;

	public String name;
	public String author;

	public Color myColor;
	public Color dColor;
	public int numProc;
	public boolean Alive;
	
	public WarriorObj(Reader file, int maxLength, Color c, Color d)
	{
		myColor = c;
		dColor = d;
		
		Assembler parser = new Assembler(file, maxLength);
		
		if (parser.assemble())
		{
			wInst = parser.getWarrior();
			wOffset = parser.getOffset();
			name = parser.getName();
			author = parser.getAuthor();
			Alive = true;
		} else
		{
			wInst = new Memory[0];
			wOffset = 0;
			Alive = false;
		}
		
	}
	
	public Memory[] getMemory(int coreSize)
	{
		for (int i=0; i<wInst.length; i++)
		{
			while (wInst[i].aValue < 0)
				wInst[i].aValue += coreSize;

			wInst[i].aValue %= coreSize;
			
			while (wInst[i].bValue < 0)
				wInst[i].bValue += coreSize;

			wInst[i].bValue %= coreSize;
		}

		return wInst;
	}
	
	public int getOffset()
	{
		return wOffset;
	}
	
	public void initPSpace(int length)
	{
		pSpace = new int[length];
		
		return;
	}
	
	public int[] getPSpace()
	{
		int[] p = new int[pSpace.length];
		
		for (int i=0; i<pSpace.length; i++)
		{
			p[i] = pSpace[i];
		}
		
		return p;
	}
	
	public int[] getNormalizedPSpace(int coreSize)
	{
		int[] p = new int[pSpace.length];
		
		for (int i=0; i<pSpace.length; i++)
		{
			int j = pSpace[i];
			
			while (j < 0)
			{
				j += coreSize;
			}
			
			j %= coreSize;
			
			p[i] = j;
		}
		
		return p;
	}
	
	public void setPSpace(int[] p)
	{
		pSpace = p;
		return;
	}
	
	public int getPCell(int index)
	{
		if (pSpace == null || index < 0 || index >= pSpace.length)
			return 0;
			
		return pSpace[index];
	}
	
	public boolean setPCell(int index, int value)
	{
		if (index < 0 || index >= pSpace.length)
		 return false;
		 
		pSpace[index] = value;
		
		return true;
	}
}
