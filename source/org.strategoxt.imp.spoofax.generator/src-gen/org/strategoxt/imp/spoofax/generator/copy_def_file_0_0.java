package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class copy_def_file_0_0 extends Strategy 
{ 
  public static copy_def_file_0_0 instance = new copy_def_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("copy_def_file_0_0");
    Fail26708:
    { 
      IStrategoTerm term11130 = term;
      Success10899:
      { 
        Fail26709:
        { 
          IStrategoTerm v_4388 = null;
          v_4388 = term;
          term = $No$Existing$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26709;
          term = $Input$File_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26709;
          IStrategoTerm term11131 = term;
          Success10900:
          { 
            Fail26710:
            { 
              term = file_exists_0_0.instance.invoke(context, generator.const7132);
              if(term == null)
                break Fail26710;
              { 
                if(true)
                  break Fail26709;
                if(true)
                  break Success10900;
              }
            }
            term = term11131;
          }
          term = v_4388;
          { 
            term = mkdir_0_0.instance.invoke(context, generator.const7132);
            if(term == null)
              break Fail26708;
            term = $Input$File_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26708;
            term = termFactory.makeTuple(term, generator.const7132);
            term = copy_file_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26708;
            if(true)
              break Success10899;
          }
        }
        term = term11130;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}