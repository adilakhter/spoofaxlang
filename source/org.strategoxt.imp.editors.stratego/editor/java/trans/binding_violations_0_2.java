package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class binding_violations_0_2 extends Strategy 
{ 
  public static binding_violations_0_2 instance = new binding_violations_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_4185, IStrategoTerm ref_c_4185)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_4185 = new TermReference(ref_b_4185);
    TermReference c_4185 = new TermReference(ref_c_4185);
    context.push("binding_violations_0_2");
    Fail21361:
    { 
      IStrategoTerm d_4185 = null;
      IStrategoTerm e_4185 = null;
      IStrategoTerm f_4185 = null;
      d_4185 = term;
      term = d_4185;
      lifted6508 lifted65080 = new lifted6508();
      lifted65080.b_4185 = b_4185;
      lifted65080.c_4185 = c_4185;
      term = filter_1_0.instance.invoke(context, term, lifted65080);
      if(term == null)
        break Fail21361;
      lifted6509 lifted65090 = new lifted6509();
      lifted65090.b_4185 = b_4185;
      lifted65090.c_4185 = c_4185;
      term = partition_1_0.instance.invoke(context, term, lifted65090);
      if(term == null)
        break Fail21361;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21361;
      e_4185 = term.getSubterm(0);
      f_4185 = term.getSubterm(1);
      term = make_set_0_0.instance.invoke(context, e_4185);
      if(term == null)
        break Fail21361;
      term = termFactory.makeTuple(term, f_4185);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}