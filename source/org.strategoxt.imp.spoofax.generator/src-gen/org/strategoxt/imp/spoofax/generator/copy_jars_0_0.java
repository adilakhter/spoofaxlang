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

@SuppressWarnings("all") public class copy_jars_0_0 extends Strategy 
{ 
  public static copy_jars_0_0 instance = new copy_jars_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("copy_jars_0_0");
    Fail26705:
    { 
      IStrategoTerm term11128 = term;
      Success10897:
      { 
        Fail26706:
        { 
          IStrategoTerm q_4388 = null;
          q_4388 = term;
          term = $Jar$Locations_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26706;
          term = q_4388;
          { 
            term = verbose_msg_2_0.instance.invoke(context, term, lifted9494.instance, lifted9495.instance);
            if(term == null)
              break Fail26705;
            term = generator.const7866;
            IStrategoTerm term11129 = term;
            Success10898:
            { 
              Fail26707:
              { 
                term = file_exists_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26707;
                if(true)
                  break Success10898;
              }
              term = mkdir_0_0.instance.invoke(context, term11129);
              if(term == null)
                break Fail26705;
            }
            term = $Jar$Locations_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26705;
            term = list_loop_1_0.instance.invoke(context, term, lifted9496.instance);
            if(term == null)
              break Fail26705;
            if(true)
              break Success10897;
          }
        }
        term = term11128;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}