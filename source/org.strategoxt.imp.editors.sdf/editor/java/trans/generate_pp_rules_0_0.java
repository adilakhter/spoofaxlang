package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class generate_pp_rules_0_0 extends Strategy 
{ 
  public static generate_pp_rules_0_0 instance = new generate_pp_rules_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_pp_rules_0_0");
    Fail76084:
    { 
      IStrategoTerm x_92073 = null;
      IStrategoTerm y_92073 = null;
      IStrategoTerm z_92073 = null;
      IStrategoTerm b_92074 = null;
      IStrategoTerm c_92074 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail76084;
      z_92073 = term.getSubterm(0);
      x_92073 = term.getSubterm(3);
      c_92074 = term;
      IStrategoTerm term41874 = term;
      Success41794:
      { 
        Fail76085:
        { 
          IStrategoTerm e_92074 = null;
          e_92074 = x_92073;
          term = guarantee_extension_0_1.instance.invoke(context, e_92074, trans.const15570);
          if(term == null)
            break Fail76085;
          y_92073 = term;
          term = add_context_0_0.instance.invoke(context, z_92073);
          if(term == null)
            break Fail76085;
          term = sdf_desugar_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76085;
          term = ppgenerate_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76085;
          term = pp_pp_table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76085;
          b_92074 = term;
          if(true)
            break Success41794;
        }
        term = term41874;
        IStrategoTerm g_92074 = null;
        g_92074 = term;
        term = concat_strings_0_0.instance.invoke(context, trans.constCons7226);
        if(term == null)
          break Fail76084;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
        term = fatal_err_msg_0_1.instance.invoke(context, g_92074, term);
        if(term == null)
          break Fail76084;
      }
      term = c_92074;
      if(y_92073 == null || b_92074 == null)
        break Fail76084;
      term = termFactory.makeTuple(y_92073, b_92074);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}