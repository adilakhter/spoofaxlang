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

@SuppressWarnings("all") public class create_derived_completions_descriptor_0_0 extends Strategy 
{ 
  public static create_derived_completions_descriptor_0_0 instance = new create_derived_completions_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_derived_completions_descriptor_0_0");
    Fail26184:
    { 
      TermReference e_4311 = new TermReference();
      IStrategoTerm term10560 = term;
      Success10481:
      { 
        Fail26185:
        { 
          IStrategoTerm term10561 = term;
          Success10482:
          { 
            Fail26186:
            { 
              term = is_heuristic_services_needed_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26186;
              { 
                if(true)
                  break Fail26185;
                if(true)
                  break Success10482;
              }
            }
            term = term10561;
          }
          term = verbose_msg_2_0.instance.invoke(context, term, lifted9386.instance, lifted9387.instance);
          if(term == null)
            break Fail26185;
          if(true)
            break Success10481;
        }
        term = term10560;
        lifted9389 lifted93890 = new lifted9389();
        lifted93890.e_4311 = e_4311;
        term = output_descriptor_file_3_0.instance.invoke(context, term, lifted9388.instance, lifted93890, _Id.instance);
        if(term == null)
          break Fail26184;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}