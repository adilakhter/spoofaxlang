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

@SuppressWarnings("all") public class reverse_bagof_$Imported$From_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Imported$From_1_0 instance = new reverse_bagof_$Imported$From_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4427)
  { 
    context.push("reverse_bagof_ImportedFrom_1_0");
    Fail27081:
    { 
      TermReference z_4426 = new TermReference();
      TermReference a_4427 = new TermReference();
      if(a_4427.value == null)
        a_4427.value = term;
      else
        if(a_4427.value != term && !a_4427.value.match(term))
          break Fail27081;
      if(z_4426.value == null)
        z_4426.value = term;
      else
        if(z_4426.value != term && !z_4426.value.match(term))
          break Fail27081;
      Success11007:
      { 
        Fail27082:
        { 
          IStrategoTerm f_4427 = null;
          f_4427 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, f_4427, generator.const7027, a_4427.value);
          if(term == null)
            break Fail27082;
          if(true)
            break Success11007;
        }
        term = generator.constNil7;
      }
      lifted10039 lifted100390 = new lifted10039();
      lifted100390.z_4426 = z_4426;
      lifted100390.a_4427 = a_4427;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100390, c_4427);
      if(term == null)
        break Fail27081;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}