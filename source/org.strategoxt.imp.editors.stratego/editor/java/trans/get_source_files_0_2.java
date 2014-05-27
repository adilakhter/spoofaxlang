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

@SuppressWarnings("all") public class get_source_files_0_2 extends Strategy 
{ 
  public static get_source_files_0_2 instance = new get_source_files_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_4180, IStrategoTerm ref_e_4180)
  { 
    TermReference d_4180 = new TermReference(ref_d_4180);
    TermReference e_4180 = new TermReference(ref_e_4180);
    context.push("get_source_files_0_2");
    Fail21340:
    { 
      IStrategoTerm f_4180 = null;
      f_4180 = term;
      term = f_4180;
      lifted6497 lifted64970 = new lifted6497();
      lifted6496 lifted64960 = new lifted6496();
      lifted64970.e_4180 = e_4180;
      lifted64960.d_4180 = d_4180;
      term = get_source_files_2_0.instance.invoke(context, term, lifted64960, lifted64970);
      if(term == null)
        break Fail21340;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}