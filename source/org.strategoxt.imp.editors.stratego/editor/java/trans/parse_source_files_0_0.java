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

@SuppressWarnings("all") public class parse_source_files_0_0 extends Strategy 
{ 
  public static parse_source_files_0_0 instance = new parse_source_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_source_files_0_0");
    Fail21339:
    { 
      IStrategoTerm z_4179 = null;
      IStrategoTerm a_4180 = null;
      IStrategoTerm b_4180 = null;
      z_4179 = term;
      term = partition_1_0.instance.invoke(context, z_4179, parse_file_0_0.instance);
      if(term == null)
        break Fail21339;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21339;
      a_4180 = term.getSubterm(0);
      b_4180 = term.getSubterm(1);
      term = termFactory.makeTuple(a_4180, b_4180);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}