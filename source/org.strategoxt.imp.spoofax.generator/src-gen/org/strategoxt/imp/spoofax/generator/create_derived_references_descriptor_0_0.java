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

@SuppressWarnings("all") public class create_derived_references_descriptor_0_0 extends Strategy 
{ 
  public static create_derived_references_descriptor_0_0 instance = new create_derived_references_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_derived_references_descriptor_0_0");
    Fail26086:
    { 
      IStrategoTerm term10485 = term;
      Success10408:
      { 
        Fail26087:
        { 
          IStrategoTerm term10486 = term;
          Success10409:
          { 
            Fail26088:
            { 
              term = is_heuristic_services_needed_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26088;
              { 
                if(true)
                  break Fail26087;
                if(true)
                  break Success10409;
              }
            }
            term = term10486;
          }
          term = verbose_msg_2_0.instance.invoke(context, term, lifted9341.instance, lifted9342.instance);
          if(term == null)
            break Fail26087;
          if(true)
            break Success10408;
        }
        term = output_descriptor_file_3_0.instance.invoke(context, term10485, lifted9343.instance, build_derived_references_descriptor_0_0.instance, _Id.instance);
        if(term == null)
          break Fail26086;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}