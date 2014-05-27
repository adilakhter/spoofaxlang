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

@SuppressWarnings("all") public class parse_sdf2_module_to_asfix_1_0 extends Strategy 
{ 
  public static parse_sdf2_module_to_asfix_1_0 instance = new parse_sdf2_module_to_asfix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4224)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_sdf2_module_to_asfix_1_0");
    Fail25482:
    { 
      IStrategoTerm z_4223 = null;
      z_4223 = term;
      Success10048:
      { 
        Fail25483:
        { 
          IStrategoTerm b_4224 = null;
          IStrategoTerm d_4224 = null;
          IStrategoTerm g_4224 = null;
          term = z_4223;
          d_4224 = z_4223;
          term = pack_sdf_table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25483;
          b_4224 = term;
          g_4224 = d_4224;
          term = parse_file_pt_0_2.instance.invoke(context, g_4224, b_4224, generator.const7012);
          if(term == null)
            break Fail25483;
          { 
            IStrategoTerm h_4224 = null;
            if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consparsetree_2 != ((IStrategoAppl)term).getConstructor())
              break Fail25482;
            h_4224 = term.getSubterm(0);
            term = check_module_name_1_1.instance.invoke(context, h_4224, a_4224, z_4223);
            if(term == null)
              break Fail25482;
            if(true)
              break Success10048;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7021, termFactory.makeListCons(z_4223, (IStrategoList)generator.constCons4560));
        term = fatal_error_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25482;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}