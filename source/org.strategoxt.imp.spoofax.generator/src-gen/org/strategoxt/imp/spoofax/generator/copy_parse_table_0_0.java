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

@SuppressWarnings("all") public class copy_parse_table_0_0 extends Strategy 
{ 
  public static copy_parse_table_0_0 instance = new copy_parse_table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("copy_parse_table_0_0");
    Fail26581:
    { 
      IStrategoTerm term10948 = term;
      Success10804:
      { 
        Fail26582:
        { 
          IStrategoTerm x_4362 = null;
          IStrategoTerm z_4362 = null;
          z_4362 = term;
          term = $Parse$Table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26582;
          term = abspath_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26582;
          x_4362 = term;
          term = z_4362;
          term = parse_table_target_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26582;
          term = abspath_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26582;
          term = termFactory.makeTuple(x_4362, term);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26582;
          if(true)
            break Success10804;
        }
        term = term10948;
        IStrategoTerm term10949 = term;
        Success10805:
        { 
          Fail26583:
          { 
            term = $Parse$Table_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26583;
            if(term.getTermType() != IStrategoTerm.STRING || !"None".equals(((IStrategoString)term).stringValue()))
              break Fail26583;
            if(true)
              break Success10805;
          }
          term = $Parse$Table_0_0.instance.invoke(context, term10949);
          if(term == null)
            break Fail26581;
          IStrategoTerm term10950 = term;
          Success10806:
          { 
            Fail26584:
            { 
              IStrategoTerm w_4362 = null;
              w_4362 = term;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26584;
              term = w_4362;
              { 
                IStrategoTerm b_4363 = null;
                IStrategoTerm d_4363 = null;
                IStrategoTerm e_4363 = null;
                IStrategoTerm h_4363 = null;
                IStrategoTerm j_4363 = null;
                d_4363 = term;
                b_4363 = generator.constNil7;
                term = d_4363;
                e_4363 = d_4363;
                term = parse_table_target_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26581;
                term = print_filename_0_2.instance.invoke(context, e_4363, b_4363, term);
                if(term == null)
                  break Fail26581;
                j_4363 = term;
                h_4363 = term;
                term = j_4363;
                term = parse_table_target_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26581;
                term = termFactory.makeTuple(h_4363, term);
                term = copy_file_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26581;
                if(true)
                  break Success10806;
              }
            }
            term = term10950;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}