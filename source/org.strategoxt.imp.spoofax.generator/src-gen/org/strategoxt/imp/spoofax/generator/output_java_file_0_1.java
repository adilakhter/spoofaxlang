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

@SuppressWarnings("all") public class output_java_file_0_1 extends Strategy 
{ 
  public static output_java_file_0_1 instance = new output_java_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4254)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_java_file_0_1");
    Fail25735:
    { 
      IStrategoTerm v_4254 = null;
      IStrategoTerm x_4254 = null;
      IStrategoTerm y_4254 = null;
      IStrategoTerm z_4254 = null;
      IStrategoTerm a_4255 = null;
      x_4254 = term;
      z_4254 = term;
      term = to_package_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25735;
      y_4254 = term;
      term = z_4254;
      IStrategoList list387;
      list387 = checkListTail(y_4254);
      if(list387 == null)
        break Fail25735;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const7128, termFactory.makeListCons(generator.const7134, list387));
      v_4254 = term;
      a_4255 = x_4254;
      term = base_filename_0_0.instance.invoke(context, t_4254);
      if(term == null)
        break Fail25735;
      term = print_filename_0_2.instance.invoke(context, a_4255, v_4254, term);
      if(term == null)
        break Fail25735;
      IStrategoTerm term10226 = term;
      Success10174:
      { 
        Fail25736:
        { 
          IStrategoTerm term10227 = term;
          Success10175:
          { 
            Fail25737:
            { 
              term = pp_java_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25737;
              if(true)
                break Success10175;
            }
            term = pp_java_string_fallback_0_0.instance.invoke(context, term10227);
            if(term == null)
              break Fail25736;
          }
          if(true)
            break Success10174;
        }
        term = term10226;
        IStrategoTerm e_4255 = null;
        e_4255 = term;
        term = fatal_err_0_1.instance.invoke(context, e_4255, generator.const7135);
        if(term == null)
          break Fail25735;
      }
      term = output_text_file_p__0_1.instance.invoke(context, term, t_4254);
      if(term == null)
        break Fail25735;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}