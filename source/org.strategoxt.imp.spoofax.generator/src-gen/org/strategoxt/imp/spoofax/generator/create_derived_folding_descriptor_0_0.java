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

@SuppressWarnings("all") public class create_derived_folding_descriptor_0_0 extends Strategy 
{ 
  public static create_derived_folding_descriptor_0_0 instance = new create_derived_folding_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_derived_folding_descriptor_0_0");
    Fail26155:
    { 
      IStrategoTerm term10539 = term;
      Success10460:
      { 
        Fail26156:
        { 
          IStrategoTerm term10540 = term;
          Success10461:
          { 
            Fail26157:
            { 
              term = is_heuristic_services_needed_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26157;
              { 
                if(true)
                  break Fail26156;
                if(true)
                  break Success10461;
              }
            }
            term = term10540;
          }
          term = verbose_msg_2_0.instance.invoke(context, term, lifted9372.instance, lifted9373.instance);
          if(term == null)
            break Fail26156;
          if(true)
            break Success10460;
        }
        term = output_descriptor_file_3_0.instance.invoke(context, term10539, lifted9374.instance, lifted9375.instance, _Id.instance);
        if(term == null)
          break Fail26155;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}