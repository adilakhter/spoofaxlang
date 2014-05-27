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

@SuppressWarnings("all") public class create_derived_outliner_descriptor_0_0 extends Strategy 
{ 
  public static create_derived_outliner_descriptor_0_0 instance = new create_derived_outliner_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_derived_outliner_descriptor_0_0");
    Fail26119:
    { 
      IStrategoTerm term10511 = term;
      Success10434:
      { 
        Fail26120:
        { 
          IStrategoTerm term10512 = term;
          Success10435:
          { 
            Fail26121:
            { 
              term = is_heuristic_services_needed_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26121;
              { 
                if(true)
                  break Fail26120;
                if(true)
                  break Success10435;
              }
            }
            term = term10512;
          }
          term = verbose_msg_2_0.instance.invoke(context, term, lifted9348.instance, lifted9349.instance);
          if(term == null)
            break Fail26120;
          if(true)
            break Success10434;
        }
        term = output_descriptor_file_3_0.instance.invoke(context, term10511, lifted9350.instance, lifted9351.instance, _Id.instance);
        if(term == null)
          break Fail26119;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}